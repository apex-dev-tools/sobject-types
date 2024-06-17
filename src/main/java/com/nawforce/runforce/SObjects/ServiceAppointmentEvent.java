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
public class ServiceAppointmentEvent extends SObject {
	public static SObjectType$<ServiceAppointmentEvent> SObjectType;
	public static SObjectFields$<ServiceAppointmentEvent> Fields;

	public Object AsgnRsrcApptSchdDtlEvent;
	public String ChangeType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public String ReplayId;
	public Object ServiceApptSchduleEvent;

	public ServiceAppointmentEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointmentEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointmentEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointmentEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointmentEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
