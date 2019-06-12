package com.bj186.crm.controller;

import com.bj186.crm.entity.FileBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

//实现文件上传功能的类

@Controller
public class FileUploadController {

    @RequestMapping(value = "/fileUploadPage", method = RequestMethod.GET)
    public ModelAndView fileUploadPage() {
        FileBean fileBean = new FileBean();
        System.out.println("fileBean" + fileBean);
        ModelAndView modelAndView = new ModelAndView("redirect:/statics/html/upload.html", "command", fileBean);
        return modelAndView;
    }
    // 返回页面应该改为ajax方式
    @RequestMapping(value="/fileUploadGo", method = RequestMethod.POST)
    public String fileUpload(@Validated FileBean fileBean, BindingResult result, ModelMap model, HttpServletRequest request) throws IOException {
        System.out.println(fileBean.getFile());
        if (fileBean.getFile().isEmpty()) {
            System.out.println("上传失败");
            return "redirect:statics/html/upload.html";
        } else {
            System.out.println("开始上传");
            String uploadPath = request.getServletContext().getRealPath("") + File.separator + "upload" + File.separator;
            MultipartFile multipartFile = fileBean.getFile();
            String fileName = multipartFile.getOriginalFilename();
            File newFile = new File(uploadPath + fileName);
            System.out.println("newFile=" + newFile);
            FileCopyUtils.copy(multipartFile.getBytes(), newFile);

            model.addAttribute("fileName", fileName);
            return "redirect:statics/html/success.html";
        }
    }
}
