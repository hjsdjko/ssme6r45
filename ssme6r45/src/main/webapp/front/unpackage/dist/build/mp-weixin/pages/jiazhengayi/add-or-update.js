(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/jiazhengayi/add-or-update"],{"0c2f":function(n,e,t){},"0d3f":function(n,e,t){"use strict";var a=t("0c2f"),r=t.n(a);r.a},2233:function(n,e,t){"use strict";t.r(e);var a=t("aa59"),r=t("6a22");for(var i in r)"default"!==i&&function(n){t.d(e,n,(function(){return r[n]}))}(i);t("0d3f");var u,o=t("f0c5"),c=Object(o["a"])(r["default"],a["b"],a["c"],!1,null,"34767a7e",null,!1,a["a"],u);e["default"]=c.exports},5475:function(n,e,t){"use strict";(function(n){t("ae7d");a(t("66fd"));var e=a(t("2233"));function a(n){return n&&n.__esModule?n:{default:n}}n(e.default)}).call(this,t("543d")["createPage"])},"6a22":function(n,e,t){"use strict";t.r(e);var a=t("9d2b"),r=t.n(a);for(var i in a)"default"!==i&&function(n){t.d(e,n,(function(){return a[n]}))}(i);e["default"]=r.a},"9d2b":function(n,e,t){"use strict";(function(n){Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0;var a=r(t("a34a"));function r(n){return n&&n.__esModule?n:{default:n}}function i(n,e,t,a,r,i,u){try{var o=n[i](u),c=o.value}catch(s){return void t(s)}o.done?e(c):Promise.resolve(c).then(a,r)}function u(n){return function(){var e=this,t=arguments;return new Promise((function(a,r){var u=n.apply(e,t);function o(n){i(u,a,r,o,c,"next",n)}function c(n){i(u,a,r,o,c,"throw",n)}o(void 0)}))}}var o=function(){Promise.all([t.e("common/vendor"),t.e("components/w-picker/w-picker")]).then(function(){return resolve(t("1b55"))}.bind(null,t)).catch(t.oe)},c={data:function(){return{ruleForm:{jiazhengzhanghao:"",mima:"",jiazhengxingming:"",xingbie:"",nianling:"",shouji:"",zhaopian:"",gongzuojingyan:""},xingbieOptions:[],xingbieIndex:0,user:{},ro:{jiazhengzhanghao:!1,mima:!1,jiazhengxingming:!1,xingbie:!1,nianling:!1,shouji:!1,zhaopian:!1,gongzuojingyan:!1}}},components:{wPicker:o},computed:{},onLoad:function(e){var t=this;return u(a.default.mark((function r(){var i,u,o,c;return a.default.wrap((function(r){while(1)switch(r.prev=r.next){case 0:return i=n.getStorageSync("nowTable"),r.next=3,t.$api.session(i);case 3:if(u=r.sent,t.user=u.data,t.xingbieOptions="男,女".split(","),t.ruleForm.userid=n.getStorageSync("userid"),e.refid&&(t.ruleForm.refid=e.refid,t.ruleForm.nickname=n.getStorageSync("nickname")),!e.id){r.next=14;break}return t.ruleForm.id=e.id,r.next=12,t.$api.info("jiazhengayi",t.ruleForm.id);case 12:u=r.sent,t.ruleForm=u.data;case 14:if(!e.cross){r.next=53;break}o=n.getStorageSync("crossObj"),r.t0=a.default.keys(o);case 17:if((r.t1=r.t0()).done){r.next=53;break}if(c=r.t1.value,"jiazhengzhanghao"!=c){r.next=23;break}return t.ruleForm.jiazhengzhanghao=o[c],t.ro.jiazhengzhanghao=!0,r.abrupt("continue",17);case 23:if("mima"!=c){r.next=27;break}return t.ruleForm.mima=o[c],t.ro.mima=!0,r.abrupt("continue",17);case 27:if("jiazhengxingming"!=c){r.next=31;break}return t.ruleForm.jiazhengxingming=o[c],t.ro.jiazhengxingming=!0,r.abrupt("continue",17);case 31:if("xingbie"!=c){r.next=35;break}return t.ruleForm.xingbie=o[c],t.ro.xingbie=!0,r.abrupt("continue",17);case 35:if("nianling"!=c){r.next=39;break}return t.ruleForm.nianling=o[c],t.ro.nianling=!0,r.abrupt("continue",17);case 39:if("shouji"!=c){r.next=43;break}return t.ruleForm.shouji=o[c],t.ro.shouji=!0,r.abrupt("continue",17);case 43:if("zhaopian"!=c){r.next=47;break}return t.ruleForm.zhaopian=o[c],t.ro.zhaopian=!0,r.abrupt("continue",17);case 47:if("gongzuojingyan"!=c){r.next=51;break}return t.ruleForm.gongzuojingyan=o[c],t.ro.gongzuojingyan=!0,r.abrupt("continue",17);case 51:r.next=17;break;case 53:t.styleChange();case 54:case"end":return r.stop()}}),r)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},xingbieChange:function(n){this.xingbieIndex=n.target.value,this.ruleForm.xingbie=this.xingbieOptions[this.xingbieIndex]},zhaopianTap:function(){var n=this;this.$api.upload((function(e){n.ruleForm.zhaopian=n.$base.url+"upload/"+e.file,n.$forceUpdate(),n.$nextTick((function(){n.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var n=this;return u(a.default.mark((function e(){return a.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(n.ruleForm.jiazhengzhanghao){e.next=3;break}return n.$utils.msg("家政账号不能为空"),e.abrupt("return");case 3:if(n.ruleForm.mima){e.next=6;break}return n.$utils.msg("密码不能为空"),e.abrupt("return");case 6:if(n.ruleForm.jiazhengxingming){e.next=9;break}return n.$utils.msg("家政姓名不能为空"),e.abrupt("return");case 9:if(!n.ruleForm.shouji||n.$validate.isMobile(n.ruleForm.shouji)){e.next=12;break}return n.$utils.msg("手机应输入手机格式"),e.abrupt("return");case 12:if(!n.ruleForm.id){e.next=17;break}return e.next=15,n.$api.update("jiazhengayi",n.ruleForm);case 15:e.next=19;break;case 17:return e.next=19,n.$api.add("jiazhengayi",n.ruleForm);case 19:n.$utils.msgBack("提交成功");case 20:case"end":return e.stop()}}),e)})))()},optionsChange:function(n){this.index=n.target.value},bindDateChange:function(n){this.date=n.target.value},getDate:function(n){var e=new Date,t=e.getFullYear(),a=e.getMonth()+1,r=e.getDate();return"start"===n?t-=60:"end"===n&&(t+=2),a=a>9?a:"0"+a,r=r>9?r:"0"+r,"".concat(t,"-").concat(a,"-").concat(r)},toggleTab:function(n){this.$refs[n].show()}}};e.default=c}).call(this,t("543d")["default"])},aa59:function(n,e,t){"use strict";var a;t.d(e,"b",(function(){return r})),t.d(e,"c",(function(){return i})),t.d(e,"a",(function(){return a}));var r=function(){var n=this,e=n.$createElement;n._self._c},i=[]}},[["5475","common/runtime","common/vendor"]]]);