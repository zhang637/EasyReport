package com.easytoolsoft.easyreport.view;

import java.util.List;
import java.util.Map;

import com.easytoolsoft.easyreport.common.viewmodel.NameTextPair;
import com.easytoolsoft.easyreport.viewmodel.HtmlFormElement;

/**
 * 
 * 报表的查询参数表单视图接口
 *
 */
public interface QueryParamFormView {

	List<NameTextPair> getTextList(List<HtmlFormElement> formElements);

	Map<String, String> getTextMap(List<HtmlFormElement> formElements);

	String getFormHtmlText(HtmlFormElement formElement);

	String getFormHtmlText(List<HtmlFormElement> formElements);
}
