/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
