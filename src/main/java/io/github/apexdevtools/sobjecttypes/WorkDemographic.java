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
public class WorkDemographic extends SObject {
	public static SObjectType$<WorkDemographic> SObjectType;
	public static SObjectFields$<WorkDemographic> Fields;

	public String Channel;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CustomWorkType;
	public String GroupIdentifier;
	public Id HistoricalWorkloadId;
	public Workload HistoricalWorkload;
	public Id Id;
	public Boolean IsDeleted;
	public Id JobProfileId;
	public JobProfile JobProfile;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Region;
	public Id ServiceTerritoryId;
	public ServiceTerritory ServiceTerritory;
	public String SkillSet;
	public Id SkillSetIdentifierId;
	public WorkType SkillSetIdentifier;
	public Datetime SystemModstamp;

	public WorkDemographic clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkDemographic clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkDemographic clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkDemographic clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkDemographic clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
