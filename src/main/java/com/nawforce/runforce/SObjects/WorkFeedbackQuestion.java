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
public class WorkFeedbackQuestion extends SObject {
	public static SObjectType$<WorkFeedbackQuestion> SObjectType;
	public static SObjectFields$<WorkFeedbackQuestion> Fields;

	public com.nawforce.runforce.System.String Choices;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String Detail;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsConfidentialAnswer;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.Boolean IsOptional;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.Integer Number;
	public Id OwnerId;
	public Name Owner;
	public Id QuestionSetId;
	public WorkFeedbackQuestionSet QuestionSet;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String Text;
	public com.nawforce.runforce.System.String Type;

	public WorkFeedback[] Feedbacks;
	public WorkFeedbackQuestionHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public WorkFeedbackQuestionShare[] Shares;

	public WorkFeedbackQuestion clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkFeedbackQuestion clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkFeedbackQuestion clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkFeedbackQuestion clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkFeedbackQuestion clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
