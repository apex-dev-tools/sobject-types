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
public class ApplnFormAppealStsChgEvnt extends SObject {
	public static SObjectType$<ApplnFormAppealStsChgEvnt> SObjectType;
	public static SObjectFields$<ApplnFormAppealStsChgEvnt> Fields;

	public String AppealIdentifier;
	public String AppealStatus;
	public String ApplicationFormIdentifier;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime EventCreationDateTime;
	public String EventUuid;
	public String ReplayId;

	public ApplnFormAppealStsChgEvnt clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApplnFormAppealStsChgEvnt clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApplnFormAppealStsChgEvnt clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApplnFormAppealStsChgEvnt clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApplnFormAppealStsChgEvnt clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
