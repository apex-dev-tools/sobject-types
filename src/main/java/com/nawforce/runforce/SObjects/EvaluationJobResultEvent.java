/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
