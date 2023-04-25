   package org.seleniumap;
/*ALL ABOUT X-PATH  (TOTALLY 14 WAYS)
 *----------------
 * 
 * 1.Why do we need X-PATH. why not other locators like
 * id, name , link and partial link text , tag name , class name.
 * 
 * 2.Using brower plugins alone?
 * When the contents are dynamic. Then we are doomed!(unfortunate outcome)
 * 
 * 3. What is XPATH? 
 * XML path.(EXTENSIBLE MARKUP LANG)
 * X-path is one of the most flexible and strongest location strategy and
 * can be used for locating an element in a web page.
 * 
 * 4. how XML PATH and its functions handle elements?
 * 
 *               SGML(std generalised markup lang)
 *            HTML (<a>,<body>,<div>)   XML(<student>)..customized tag names
 *            
 *  hence, x-path can be used to loacate elements in HTML pages(web pages).
 *              
 * 5. What approach we are going to follow to locate dynamic elements?(unique ah indha element ila)(dynamic)
 *
 *   since, some elements don't have unique identifiers or may be with dynamic ids and so on...
 *         
 * 6.Types => 1.ABSOLUTE 1. RELATIVE              
 * 
 * /html/head/body/div/p---> absolute xpath (will start from root node nd have single slash)
 * //p  ----> Relative xpath (will start from the current node nd have double slash in front of it)
 * 
 * 7. Identification Strategies:
 * LOCATING WITH RESPECT TO ELEMENTS AND ATTRIBUTES:
 * -------------------------------------------------
 * ==============================================================================================================
 * 
 * <input name="txtUsername" id="txtUsername" type="text">
 * 
 * input --> ELEMENT NAME
 * name --> ATTRIBUTE NAME
 * txtUsername --> ATTRIBUTE VALUE
 * 
 * =============================================================================================================
 * 1.Locating Elements with Known Attribute
 * 
 * //*[@attributename = 'value']  (only known attribute)  ex://*[@id='txtUsername'] *--> ELEMENT
 * --------------------------------------------------------------------------------------------------------------
 * 2.Locating Elements with Known Elemenet and Attributes (both element nd attribute known)
 * 
 * //input[@id="txtUsername"], //input[@name="txtUsername"] input--> ELEMENT
 * --------------------------------------------------------------------------------------------------------------
 * 3.Locating Elements with Known Visible Text (exact match)
 *  
 *  Syntax: //Elementname[text()='ExactText'] 
 *  
 *  //a[text()='OrangeHRM, Inc']
 *  
 *  text()--> one of the function used in x-path 
 *  
 *  NOTE: Its case sensitive and if u don't know the element name, its ok but then put * in that element place.
 *  
 *  -------------------------------------------------------------------------------------------------------------
 * 4.Locating Elements When part of the visible text is known (partial match)
 * 
 *  Syntax: //elementname[contains(text(),'part of the text')]
 * 
 * Ex: //a[contains(text(),'OrangeHRM')]
 * --------------------------------------------------------------------------------------------------------------
 * 5.Locating Elements with Multiple Attributes
 * 
 * To locate an exact element , we can use multiple attributes for selection.
 * 
 * Syntax: //*[attribute1='value1'][attribute2='value2'].....[attributeN='valueN']
 * 
 * Ex: //input[@name='txtUsername'][@id='txtUsername'][@type='text'] 
 * 
 * ---------------------------------------------------------------------------------------------------------------
 * 
 * 6.Locating Elements with Starting Visible text is known.  ***important***
 * 
 * Ex: id=riya123
 *     id=riya789
 *     id=riya567
 * 
 * Syntax: //elementname[starts-with(text(),'starting text')]
 * 
 * startswith() --> function
 * text() --> function
 * contains()
 * 
 * Ex: //*[starts-with(text(),'riya')]
 * 
 * ----------------------------------------------------------------------------------------------------------------
 * 
 * 7.Locating Elements with Dynamic Attribute values.
 * 
 * NOTE: X-path can do bi-directional navigation (going forward and backward)
 * 
 * Syntax:
 *  //elementname[contains(@attributeName,'part of the value')]
 *  //elementname[starts-with(@attributeName,'fixed prefix of the value')]
 * 
 * Ex:
 * //*[contains(@href,'orange')]
 * //*[starts-with(@href,'http')]
 * 
 * 
 * ---------------------------------------------------------------------------------------------------------------
 * 
 * 
 * Locating Elements relative to knowm element
 * ==========================================
 * 1.Locating a parent element.
 * 
 * The Parent axex contains the parent of the context node.
 * 
 * Syntax: //<knownXpath>/parent::elementName
 * 
 * ex: //*[id='divUsername']/parent::form
 * 
 * current ah edutha x-path ku parent yaru nu indha syntax sollum.
 * -----------------------------------------------------------------------------------------
 * 
 * 2.Locating a child element.
 * The child axes contains the children of the context node.
 * 
 * syntax:
 * 
 * //<xpathofknownElement>/child::<elementName>
 * Ex: //div[@id='divUsername']/child::input
 * 
 * //<xpathofknownElement>/<elementName>
 * Ex: //div[@id='divUsername']/input
 *
 * --------------------------------------------------------------------------------------------
 * 
 * 3.Locating ancestors of a known element. 
 * 
 * The ancestor axes contains the ancestors of the known element
 * ancestor axes consists of the parent of the known element 
 * and the parent's parent so on..
 * 
 * Syntax:
 * //<xpathofKnownElement>/ancestor::<elementName> or
 * //<xpathofKnownElement>/ancestor::*
 * 
 *  //*[@id='txtUsername']/ancestor::* or <elementName> (div,html,form,body..)
 * ----------------------------------------------------------------------------------------------
 * 
 * 4.Locating following elements.
 * 
 * Keyword= following::
 * syntax:
 * //<xpathofKnownElement>/folowing:: <elementName>
 * 
 * ex: //*[@id='txtUsername']/following::input[2] (if u want 2nd position)
 * ex: //*[@id='txtUsername']/following::input[last()] (if u want last element)
 * 
 * following --> namma current node(KnownElement(input)) ku aduthu varraadhu ellame..
 * -----------------------------------------------------------------------------------------------
 * 
 * 5.Locating preceding element.
 * 
 * preceding --> current node(KnownElement) ku munnadi varraadhu ellame..
 * ex:
 * 
 *  //*[@id='txtUsername']/preceding::input[2] (for specific position use[2])
 * -----------------------------------------------------------------------------------------------
 * 
 * 6.Locating following sibling.
 * 
 * keyword: following-sibling::
 * 
 * to locate the elements comes after to a known element 
 * within same HTML hierarchy.
 *  
 *Syntax: //<xpathofKnownElement>/following-sibling::<element name>  
 *ex: //*[@id='txtUsername']/following-sibling::span
 * 
 * ------------------------------------------------------------------------------------------------
 * 
 * 7.Locating preceding sibling.
 * 
 * Keyword: preceding-sibling::
 * to selects the siblings that comes before the context node with a known X-path.
 * (nodes in same level of the HTML hierarchy)
 * 
 * syntax: //<xpathofknownelement>/preceding-sibling::<elementName>
 * Ex:
 * //*[@class='form-hint']/preceding-sibling::* or elementname
 * 
 * ---------------------------------------------------------------------------------------------
 * 
 * Axes:
 * 1.parent
 * 2.child
 * 3.ancestors
 * 4.following
 * 5.preceding
 * 6.following-sibling::
 * 7.preceding-sibling::
 * 
 * Syntax:
 * 1.//<knownXpath>/parent::elementName
 * 
 *  //*[id='divUsername']/parent::form
 *-----------------------------------------------------  
 * 2.//<xpathofknownElement>/child::<elementName>
 * 
 * //div[@id='divUsername']/child::input
 * 
 * ------------------------------------------------------
 * 3.//<xpathofKnownElement>/ancestor::<elementName>
 * 
 * //*[@id='txtUsername']/ancestor::* or <elementName> (div,html,form,body..)
 * -------------------------------------------------------
 * 4.//<xpathofKnownElement>/following::<elementName>
 * 
 * ex: //*[@id='txtUsername']/following::input[2] (if u want 2nd position)
 * ex: //*[@id='txtUsername']/following::input[last()] (if u want last element)
-------------------------------------------------------------------------------
 * 
 * 5.//<xpathofKnownElement>/preceding::<elementName>
 * 
 * //*[@id='txtUsername']/preceding::input[2] (for specific position use[2])
 * 
 * -------------------------------------------------------------------------------
 * 6.//<xpathofKnownElement>/following-sibling::<elementName>  
 * 
 * //*[@id='txtUsername']/following-sibling::span
 * 
 * ------------------------------------------------------------------------------
 * 7.//<xpathofknownelement>/preceding-sibling::<elementName>
 * 
 * //*[@class='form-hint']/preceding-sibling::* or elementname
 * 
 * ------------------------------------------------------------------------------
 * startswith() --> function
 * text() --> function
 * contains()
 * last()
 * 
 * Ex:(for syntax)
 * 
 * 
 * 5.//*[@id='txtUsername']/preceding::input[2] (for specific position use[2] )
 * 
 * 
 * 
 * ------------------------------------------------------------------------------------------------
 * 
 * https://opensource-demo.orangehrmlive.com/
 * 
 * to learn x-path more -- https://topswagcode.com/xpath/
 * 
 * 
 * 1.Locating Elements with Known Attribute:
 * //*[@id='txtUsername']
 * 
 * 2.(both element nd attribute known):
 * //input[@id="txtUsername"]
 * 
 * 3.Locating Elements with Known Visible Text (exact match)
 * //a[text()='OrangeHRM, Inc']
 * 
 * 4.Locating Elements When part of the visible text is known (partial match)
 * //a[contains(text(),'OrangeHRM')]
 * 
 * 5.Locating Elements with Multiple Attributes
 * //input[@name='txtUsername'][@id='txtUsername'][@type='text'] 
 * 
 * 6.Locating Elements with Starting Visible text is known.
 * //*[starts-with(text(),'riya')]
 * 
 * 7.Locating Elements with Dynamic Attribute values.
 * 
 * Partial ..
 * 
 * //elementname[contains(@attributeName,'part of the value')]
 * 
 * //*[contains(@href,'orange')]
 * 
 * -----------------------------------------------------
 * begin with ..
 * 
 * //*[starts-with(@href,'http')]
 * 
 * -------------------------------------------
 * 8.Normalize-space()
 * 
 * //button[normalize-space()='Referthevideo']  
 *  
 * text= Refer the video
 * 
 * --------------------------------------------
 * 9. .= 
 * 
 * //label[.='Enter your full Name']
 * -----------------------------------------
 * 10. Functions  
 * 
 *  last() , last()-n ,contains(), position()=1, position()>1 (2nd element)
 * 
 * (//input)[last()]
 * 
 * (//input)[last()-2]
 *------------------------------ 
 * (//input)[position()=2]
 * 
 * (//input)[ position()>1]
 *---------------------------------
 * 
 * 11. Conditional [and / or]
 *  
 *  //input[@name='txtUsername'and @id='txtUsername']
 *  
 * 12 text based:
 * 
 *  text: Enter your full Name
 *  
 *  //label[text()='Enter your full Name']
 *  
 *  //label[contains(text(),'Enter your')]  (partailly)
 *  
 *  //label[starts-with(text(),'Enter')]   (start with that word)
 *  
 *   //label[.='Enter your full Name']
 *   
 *  we can use this also --> .= instaed of test()=
 *   
 *   
 *   ------------------------
 *   
 *   div-a-strong (tagnames) [anchestor-parent-child]
 *   
 *   //strong[.='Sign up']/parent::a[@class='button is-primary']
 *   
 *   //strong[.='Sign up']/.. (short cut) (from child[strong] to parent[a])
 *   
 *   ----------------------------------------------------
 *   
 *   svg tagname:
 *   
 *   //*[local-name()='svg'][@class='gloabal-nav']
 *   
 *   -----------------------------------------------------
 *   
 */



















public class XpathEx {

}
