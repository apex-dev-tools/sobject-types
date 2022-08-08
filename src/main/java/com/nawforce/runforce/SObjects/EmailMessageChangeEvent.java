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
public class EmailMessageChangeEvent extends SObject {
	public static SObjectType$<EmailMessageChangeEvent> SObjectType;
	public static SObjectFields$<EmailMessageChangeEvent> Fields;

	public Id ActivityId;
	public Task Activity;
	public com.nawforce.runforce.System.String BccAddress;
	public com.nawforce.runforce.System.String CcAddress;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id EmailTemplateId;
	public EmailTemplate EmailTemplate;
	public Datetime FirstOpenedDate;
	public com.nawforce.runforce.System.String FromAddress;
	public com.nawforce.runforce.System.String FromName;
	public com.nawforce.runforce.System.Boolean HasAttachment;
	public com.nawforce.runforce.System.String Headers;
	public com.nawforce.runforce.System.String HtmlBody;
	public Id Id;
	public com.nawforce.runforce.System.Boolean Incoming;
	public com.nawforce.runforce.System.Boolean IsBounced;
	public com.nawforce.runforce.System.Boolean IsClientManaged;
	public com.nawforce.runforce.System.Boolean IsExternallyVisible;
	public com.nawforce.runforce.System.Boolean IsTracked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastOpenedDate;
	public Datetime MessageDate;
	public com.nawforce.runforce.System.String MessageIdentifier;
	public Id ParentId;
	public Case Parent;
	public Id RelatedToId;
	public SObject RelatedTo;
	public com.nawforce.runforce.System.String ReplayId;
	public Id ReplyToEmailMessageId;
	public EmailMessage ReplyToEmailMessage;
	public com.nawforce.runforce.System.String Status;
	public com.nawforce.runforce.System.String Subject;
	public com.nawforce.runforce.System.String TextBody;
	public com.nawforce.runforce.System.String ThreadIdentifier;
	public com.nawforce.runforce.System.String ToAddress;

	public EmailMessageChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmailMessageChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmailMessageChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmailMessageChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmailMessageChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
