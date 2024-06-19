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
public class EmailMessageChangeEvent extends SObject {
	public static SObjectType$<EmailMessageChangeEvent> SObjectType;
	public static SObjectFields$<EmailMessageChangeEvent> Fields;

	public Id ActivityId;
	public Task Activity;
	public String AutomationType;
	public String BccAddress;
	public String CcAddress;
	public Object ChangeEventHeader;
	public String ClientThreadIdentifier;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Division;
	public Id EmailTemplateId;
	public EmailTemplate EmailTemplate;
	public Datetime FirstOpenedDate;
	public String FromAddress;
	public String FromName;
	public Boolean HasAttachment;
	public String Headers;
	public String HtmlBody;
	public Id Id;
	public Boolean Incoming;
	public Boolean IsBounced;
	public Boolean IsClientManaged;
	public Boolean IsExternallyVisible;
	public Boolean IsTracked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastOpenedDate;
	public Datetime MessageDate;
	public String MessageIdentifier;
	public Id ParentId;
	public Case Parent;
	public Id RelatedToId;
	public SObject RelatedTo;
	public String ReplayId;
	public Id ReplyToEmailMessageId;
	public EmailMessage ReplyToEmailMessage;
	public String Status;
	public String Subject;
	public String TextBody;
	public String ThreadIdentifier;
	public String ToAddress;

	public EmailMessageChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmailMessageChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmailMessageChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmailMessageChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmailMessageChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
