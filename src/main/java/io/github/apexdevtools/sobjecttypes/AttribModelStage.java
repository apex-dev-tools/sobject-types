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
public class AttribModelStage extends SObject {
	public static SObjectType$<AttribModelStage> SObjectType;
	public static SObjectFields$<AttribModelStage> Fields;

	public Id AttribModelId;
	public AttribModel AttribModel;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String EngagementSignalEnum;
	public Id EngagementSignalId;
	public EngagementSignal EngagementSignal;
	public Id Id;
	public Boolean IsContentMatchRequired;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Integer Sequence;
	public String StageUnionGroupName;
	public Datetime SystemModstamp;

	public AttribModelStageMetric[] AttribModelStageMetrics;

	public AttribModelStage clone$() {throw new java.lang.UnsupportedOperationException();}
	public AttribModelStage clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AttribModelStage clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AttribModelStage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AttribModelStage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
