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
public class AppointmentSchedulingEvent extends SObject {
	public static SObjectType$<AppointmentSchedulingEvent> SObjectType;
	public static SObjectFields$<AppointmentSchedulingEvent> Fields;

	public AsgnRsrcApptSchdEvent[] AssignedResourceFields;
	public String ChangeType;
	public String CorrelationId;
	public String EventUuid;
	public String ReplayId;
	public SvcApptSchdEvent[] ServiceAppointmentFields;

	public AppointmentSchedulingEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AppointmentSchedulingEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AppointmentSchedulingEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AppointmentSchedulingEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AppointmentSchedulingEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
