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
public class AiJobRunStatusEvent extends SObject {
	public static SObjectType$<AiJobRunStatusEvent> SObjectType;
	public static SObjectFields$<AiJobRunStatusEvent> Fields;

	public String AiJobRunIdentifier;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public String JobType;
	public String ReplayId;
	public String Status;
	public String Target;

	public AiJobRunStatusEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AiJobRunStatusEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AiJobRunStatusEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AiJobRunStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AiJobRunStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
