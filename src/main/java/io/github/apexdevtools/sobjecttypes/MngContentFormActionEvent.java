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
public class MngContentFormActionEvent extends SObject {
	public static SObjectType$<MngContentFormActionEvent> SObjectType;
	public static SObjectFields$<MngContentFormActionEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public String FormContentKey;
	public String FormData;
	public String FormVersion;
	public String IndividualKey;
	public String ReferenceRecord;
	public String ReplayId;

	public MngContentFormActionEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MngContentFormActionEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MngContentFormActionEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MngContentFormActionEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MngContentFormActionEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
