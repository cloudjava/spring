package com.tr.spring.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
public class AdvanceAction extends BaseAction {
}
