/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ExperimentJobStatusEvent extends SObject {
	public static SObjectType$<ExperimentJobStatusEvent> SObjectType;
	public static SObjectFields$<ExperimentJobStatusEvent> Fields;

	public String AnalysisStatus;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ErrorCode;
	public String ErrorMessage;
	public Datetime EventPublishTime;
	public String EventUuid;
	public String ExperimentIdentifier;
	public String ExperimentStatus;
	public Boolean HasEndReached;
	public Decimal LeadingCohortChanceToBeatAll;
	public Decimal LeadingCohortChanceToBeatControl;
	public String LeadingCohortIdentifier;
	public String ReplayId;
	public String Status;
	public Datetime TimeWinnerDetermined;

	public ExperimentJobStatusEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExperimentJobStatusEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExperimentJobStatusEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExperimentJobStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExperimentJobStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
