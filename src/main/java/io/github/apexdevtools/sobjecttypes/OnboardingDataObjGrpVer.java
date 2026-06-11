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
public class OnboardingDataObjGrpVer extends SObject {
	public static SObjectType$<OnboardingDataObjGrpVer> SObjectType;
	public static SObjectFields$<OnboardingDataObjGrpVer> Fields;

	public String ComputationSource;
	public String ComputationType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OnboardingDataObjGrpId;
	public OnboardingDataObjGrp OnboardingDataObjGrp;
	public String Status;
	public Datetime SystemModstamp;
	public Integer VersionNumber;

	public OnbrdDataObjGrpRecVld[] OnbrdDataObjGrpRecVlds;

	public OnboardingDataObjGrpVer clone$() {throw new java.lang.UnsupportedOperationException();}
	public OnboardingDataObjGrpVer clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OnboardingDataObjGrpVer clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OnboardingDataObjGrpVer clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OnboardingDataObjGrpVer clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
