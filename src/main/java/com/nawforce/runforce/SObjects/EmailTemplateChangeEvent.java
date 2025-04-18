/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class EmailTemplateChangeEvent extends SObject {
	public static SObjectType$<EmailTemplateChangeEvent> SObjectType;
	public static SObjectFields$<EmailTemplateChangeEvent> Fields;

	public Decimal ApiVersion;
	public String Body;
	public Id BrandTemplateId;
	public BrandTemplate BrandTemplate;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public String Encoding;
	public Id EnhancedLetterheadId;
	public EnhancedLetterhead EnhancedLetterhead;
	public Id FolderId;
	public SObject Folder;
	public String HtmlValue;
	public Id Id;
	public Boolean IsActive;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastUsedDate;
	public String Markup;
	public String Name;
	public String NamespacePrefix;
	public Id OwnerId;
	public User Owner;
	public String RelatedEntityType;
	public String ReplayId;
	public String Subject;
	public String TemplateStyle;
	public String TemplateType;
	public Integer TimesUsed;
	public String UiType;

	public EmailTemplateChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmailTemplateChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmailTemplateChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmailTemplateChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmailTemplateChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
