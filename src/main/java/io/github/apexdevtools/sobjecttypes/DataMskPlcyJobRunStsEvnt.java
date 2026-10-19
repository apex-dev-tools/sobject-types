/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class DataMskPlcyJobRunStsEvnt extends SObject {
	public static SObjectType$<DataMskPlcyJobRunStsEvnt> SObjectType;
	public static SObjectFields$<DataMskPlcyJobRunStsEvnt> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public Datetime EndTime;
	public String ErrorMessage;
	public String EventUuid;
	public String JobIdentifier;
	public String JobType;
	public Integer Progress;
	public String ReplayId;
	public Datetime StartTime;
	public String Status;
	public String StepName;

	public DataMskPlcyJobRunStsEvnt clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataMskPlcyJobRunStsEvnt clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataMskPlcyJobRunStsEvnt clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataMskPlcyJobRunStsEvnt clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataMskPlcyJobRunStsEvnt clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
