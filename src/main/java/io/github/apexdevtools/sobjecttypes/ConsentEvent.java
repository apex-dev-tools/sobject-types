/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ConsentEvent extends SObject {
	public static SObjectType$<ConsentEvent> SObjectType;
	public static SObjectFields$<ConsentEvent> Fields;

	public String AssociatedIds;
	public String ChangeInitiator;
	public Datetime ChangeTimestamp;
	public String ChangeType;
	public String ConsentCaptureSource;
	public String ConsentCaptureType;
	public String EventUuid;
	public String NewValues;
	public String ObjectName;
	public String RecordId;
	public String ReplayId;

	public ConsentEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ConsentEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ConsentEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ConsentEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ConsentEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
