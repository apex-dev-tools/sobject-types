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
public class DiscoveryPredictionEvent extends SObject {
	public static SObjectType$<DiscoveryPredictionEvent> SObjectType;
	public static SObjectFields$<DiscoveryPredictionEvent> Fields;

	public String ActualValue;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public String GoalId;
	public Boolean HasError;
	public String ModelId;
	public String PredictedValue;
	public Datetime PredictionTime;
	public String ReplayId;
	public String RunId;
	public String TargetEntity;
	public String TargetField;
	public String TargetId;
	public String ValueType;

	public DiscoveryPredictionEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DiscoveryPredictionEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DiscoveryPredictionEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DiscoveryPredictionEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DiscoveryPredictionEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
