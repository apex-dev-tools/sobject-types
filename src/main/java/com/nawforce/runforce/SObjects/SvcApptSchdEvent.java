/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class SvcApptSchdEvent extends SObject {
	public static SObjectType$<SvcApptSchdEvent> SObjectType;
	public static SObjectFields$<SvcApptSchdEvent> Fields;

	public String AdditionalInformation;
	public String Address;
	public String AppointmentType;
	public Object ChangedFields;
	public String Comments;
	public String ContactId;
	public Decimal DurationInMinutes;
	public String Email;
	public String EventUuid;
	public String ParentRecordId;
	public String Phone;
	public Datetime ScheduledEndTime;
	public Datetime ScheduledStartTime;
	public String ServiceAppointmentId;
	public String ServiceTerritoryId;
	public String Status;
	public String StatusCategory;
	public String Subject;
	public Integer WorkTypeBlockTimeAfterAppointment;
	public String WorkTypeBlockTimeAfterUnit;
	public Integer WorkTypeBlockTimeBeforeAppointment;
	public String WorkTypeBlockTimeBeforeUnit;
	public String WorkTypeId;

	public SvcApptSchdEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public SvcApptSchdEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SvcApptSchdEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SvcApptSchdEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SvcApptSchdEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
