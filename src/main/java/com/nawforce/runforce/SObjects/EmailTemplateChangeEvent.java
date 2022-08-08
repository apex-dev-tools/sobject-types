/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class EmailTemplateChangeEvent extends SObject {
	public static SObjectType$<EmailTemplateChangeEvent> SObjectType;
	public static SObjectFields$<EmailTemplateChangeEvent> Fields;

	public Decimal ApiVersion;
	public com.nawforce.runforce.System.String Body;
	public Id BrandTemplateId;
	public BrandTemplate BrandTemplate;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.String DeveloperName;
	public com.nawforce.runforce.System.String Encoding;
	public Id EnhancedLetterheadId;
	public EnhancedLetterhead EnhancedLetterhead;
	public Id FolderId;
	public SObject Folder;
	public com.nawforce.runforce.System.String HtmlValue;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsActive;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastUsedDate;
	public com.nawforce.runforce.System.String Markup;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.String NamespacePrefix;
	public Id OwnerId;
	public User Owner;
	public com.nawforce.runforce.System.String RelatedEntityType;
	public com.nawforce.runforce.System.String ReplayId;
	public com.nawforce.runforce.System.String Subject;
	public com.nawforce.runforce.System.String TemplateStyle;
	public com.nawforce.runforce.System.String TemplateType;
	public com.nawforce.runforce.System.Integer TimesUsed;
	public com.nawforce.runforce.System.String UiType;

	public EmailTemplateChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmailTemplateChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmailTemplateChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmailTemplateChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmailTemplateChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
