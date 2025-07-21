/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class EmailMessage extends SObject {
	public static SObjectType$<EmailMessage> SObjectType;
	public static SObjectFields$<EmailMessage> Fields;

	public Id ActivityId;
	public Task Activity;
	public String AttachmentIds;
	public String AutomationType;
	public String BccAddress;
	public String CcAddress;
	public String ClientThreadIdentifier;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Division;
	public Id EmailTemplateId;
	public EmailTemplate EmailTemplate;
	public Datetime FirstOpenedDate;
	public String FromAddress;
	public Id FromId;
	public SObject From;
	public String FromName;
	public Boolean HasAttachment;
	public String Headers;
	public String HtmlBody;
	public Id Id;
	public Boolean Incoming;
	public Boolean IsBounced;
	public Boolean IsClientManaged;
	public Boolean IsDeleted;
	public Boolean IsExternallyVisible;
	public Boolean IsOpened;
	public Boolean IsTracked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastOpenedDate;
	public Datetime MessageDate;
	public String MessageIdentifier;
	public String Name;
	public Id ParentId;
	public Case Parent;
	public Id RelatedToId;
	public Name RelatedTo;
	public Id ReplyToEmailMessageId;
	public EmailMessage ReplyToEmailMessage;
	public String Source;
	public String Status;
	public String Subject;
	public Datetime SystemModstamp;
	public String TextBody;
	public String ThreadIdentifier;
	public String ToAddress;
	public String ValidatedFromAddress;
	public String[] ContentDocumentIds;
	public String[] ToIds;
	public String[] CcIds;
	public String[] BccIds;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public Case[] Cases;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessageRelation[] EmailMessageRelations;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public EmailMessage clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmailMessage clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmailMessage clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmailMessage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmailMessage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
