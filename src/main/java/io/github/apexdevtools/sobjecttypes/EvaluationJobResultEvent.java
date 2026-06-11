/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class EvaluationJobResultEvent extends SObject {
	public static SObjectType$<EvaluationJobResultEvent> SObjectType;
	public static SObjectFields$<EvaluationJobResultEvent> Fields;

	public String Assertions;
	public String ComputeStatus;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EvaluationJobIdentity;
	public String EventUuid;
	public String Generations;
	public String Message;
	public String Metrics;
	public String ReplayId;

	public EvaluationJobResultEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EvaluationJobResultEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EvaluationJobResultEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EvaluationJobResultEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EvaluationJobResultEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
