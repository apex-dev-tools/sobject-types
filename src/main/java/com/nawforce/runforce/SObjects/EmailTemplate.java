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
public class EmailTemplate extends SObject {
	public static SObjectType$<EmailTemplate> SObjectType;
	public static SObjectFields$<EmailTemplate> Fields;

	public Decimal ApiVersion;
	public String Body;
	public Id BrandTemplateId;
	public BrandTemplate BrandTemplate;
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
	public String FolderName;
	public String HtmlValue;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsBuilderContent;
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
	public String Subject;
	public Datetime SystemModstamp;
	public String TemplateStyle;
	public String TemplateType;
	public Integer TimesUsed;
	public String UiType;

	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public UserDefinedLabelAssignment[] UserDefinedLabelAssignments;

	public EmailTemplate clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmailTemplate clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmailTemplate clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmailTemplate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmailTemplate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
