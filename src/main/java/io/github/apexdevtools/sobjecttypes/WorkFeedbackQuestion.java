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

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class WorkFeedbackQuestion extends SObject {
	public static SObjectType$<WorkFeedbackQuestion> SObjectType;
	public static SObjectFields$<WorkFeedbackQuestion> Fields;

	public io.github.apexdevtools.standardtypes.System.String Choices;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public io.github.apexdevtools.standardtypes.System.String CurrencyIsoCode;
	public io.github.apexdevtools.standardtypes.System.String Detail;
	public Id Id;
	public io.github.apexdevtools.standardtypes.System.Boolean IsConfidentialAnswer;
	public io.github.apexdevtools.standardtypes.System.Boolean IsDeleted;
	public io.github.apexdevtools.standardtypes.System.Boolean IsOptional;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public io.github.apexdevtools.standardtypes.System.String Name;
	public io.github.apexdevtools.standardtypes.System.Integer Number;
	public Id OwnerId;
	public Name Owner;
	public Id QuestionSetId;
	public WorkFeedbackQuestionSet QuestionSet;
	public Datetime SystemModstamp;
	public io.github.apexdevtools.standardtypes.System.String Text;
	public io.github.apexdevtools.standardtypes.System.String Type;

	public WorkFeedback[] Feedbacks;
	public WorkFeedbackQuestionHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public WorkFeedbackQuestionShare[] Shares;

	public WorkFeedbackQuestion clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkFeedbackQuestion clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkFeedbackQuestion clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId, io.github.apexdevtools.standardtypes.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkFeedbackQuestion clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId, io.github.apexdevtools.standardtypes.System.Boolean isDeepClone, io.github.apexdevtools.standardtypes.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkFeedbackQuestion clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId, io.github.apexdevtools.standardtypes.System.Boolean isDeepClone, io.github.apexdevtools.standardtypes.System.Boolean preserveReadonlyTimestamps, io.github.apexdevtools.standardtypes.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
