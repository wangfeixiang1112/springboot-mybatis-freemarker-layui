package com.icecream.app.test.web.controller;


import com.icecream.app.core.util.Page;
import com.icecream.app.core.util.PageResult;
import com.icecream.app.test.entity.TClass;
import com.icecream.app.test.model.QueryTClassList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("tclass")
public class TClassController {
   // @RequestMapping("/queryTClassList")
    public PageResult selectByPages(Page<QueryTClassList> page){
        List<TClass> tclassList= new ArrayList<>();
        TClass tClass = new TClass();
        tClass.setId(1);
        tClass.setName("一班");
        tclassList.add(tClass);
        PageResult<TClass> pageRusult =new PageResult<TClass>(tclassList);
        pageRusult.setCode(0);
        return pageRusult;
    }
    @RequestMapping("/saveOrUpdateTClass")
    public Map<String,Object> saveOrUpdateTClass(TClass tclass){
        LinkedHashMap<String,Object> resultMap=new LinkedHashMap<String,Object>();
       /* try {
            return tclassService.saveOrUpdateTClass(tclass);
        }catch (Exception e){
            resultMap.put("state","fail");
            resultMap.put("message","操作失败");
            return resultMap;
        }*/
        return resultMap;
    }
    @RequestMapping("/deleteTClass")
    public Map<String,Object> deleteTClass(String id){
        LinkedHashMap<String,Object> resultMap=new LinkedHashMap<String,Object>();
        try {
            /*if(StringUtil.isNotEmpty(id)){
                tclassService.delete(id);
                resultMap.put("state","success");
                resultMap.put("message","删除班级成功");
                return resultMap;
            }else{
                resultMap.put("state","fail");
                resultMap.put("message","删除班级失败");
                return resultMap;
            }*/
        }catch (Exception e){
            resultMap.put("state","fail");
            resultMap.put("message","操作异常，删除班级失败");
            return resultMap;
        }
        return resultMap;
    }
}
