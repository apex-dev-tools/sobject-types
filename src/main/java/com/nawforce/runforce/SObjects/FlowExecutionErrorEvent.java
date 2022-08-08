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
public class FlowExecutionErrorEvent extends SObject {
	public static SObjectType$<FlowExecutionErrorEvent> SObjectType;
	public static SObjectFields$<FlowExecutionErrorEvent> Fields;

	public com.nawforce.runforce.System.String ContextObject;
	public Id ContextRecordId;
	public SObject ContextRecord;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String ElementApiName;
	public com.nawforce.runforce.System.String ElementType;
	public com.nawforce.runforce.System.String ErrorId;
	public com.nawforce.runforce.System.String ErrorMessage;
	public Datetime EventDate;
	public com.nawforce.runforce.System.String EventIdentifier;
	public com.nawforce.runforce.System.String EventType;
	public com.nawforce.runforce.System.String EventUuid;
	public com.nawforce.runforce.System.String ExtendedErrorCode;
	public com.nawforce.runforce.System.String FlowApiName;
	public Datetime FlowExecutionEndDate;
	public Datetime FlowExecutionStartDate;
	public com.nawforce.runforce.System.String FlowNamespace;
	public com.nawforce.runforce.System.String FlowVersionId;
	public com.nawforce.runforce.System.Integer FlowVersionNumber;
	public com.nawforce.runforce.System.String InterviewBatchId;
	public com.nawforce.runforce.System.String InterviewGuid;
	public com.nawforce.runforce.System.String InterviewRequestId;
	public Datetime InterviewStartDate;
	public Id InterviewStartedById;
	public User InterviewStartedBy;
	public com.nawforce.runforce.System.String ProcessType;
	public com.nawforce.runforce.System.String RelatedRecordId;
	public com.nawforce.runforce.System.String ReplayId;
	public com.nawforce.runforce.System.String StageQualifiedApiName;
	public Id UserId;
	public User User;
	public com.nawforce.runforce.System.String Username;

	public FlowExecutionErrorEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowExecutionErrorEvent clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowExecutionErrorEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowExecutionErrorEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowExecutionErrorEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
