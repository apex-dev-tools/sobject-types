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
