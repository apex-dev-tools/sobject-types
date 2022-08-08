/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ServiceAppointmentChangeEvent extends SObject {
	public static SObjectType$<ServiceAppointmentChangeEvent> SObjectType;
	public static SObjectFields$<ServiceAppointmentChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Decimal ActualDuration;
	public Datetime ActualEndTime;
	public Datetime ActualStartTime;
	public Address Address;
	public com.nawforce.runforce.System.String AppointmentNumber;
	public com.nawforce.runforce.System.String ApptBookingInfoUrl;
	public Datetime ArrivalWindowEndTime;
	public Datetime ArrivalWindowStartTime;
	public Object ChangeEventHeader;
	public com.nawforce.runforce.System.String City;
	public Id ContactId;
	public Contact Contact;
	public com.nawforce.runforce.System.String Country;
	public com.nawforce.runforce.System.String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String Description;
	public Datetime DueDate;
	public Decimal Duration;
	public Decimal DurationInMinutes;
	public com.nawforce.runforce.System.String DurationType;
	public Datetime EarliestStartTime;
	public com.nawforce.runforce.System.String GeocodeAccuracy;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsOffsiteAppointment;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal Latitude;
	public Decimal Longitude;
	public Id OwnerId;
	public User Owner;
	public Id ParentRecordId;
	public SObject ParentRecord;
	public com.nawforce.runforce.System.String PostalCode;
	public com.nawforce.runforce.System.String ReplayId;
	public Datetime SchedEndTime;
	public Datetime SchedStartTime;
	public com.nawforce.runforce.System.String ServiceNote;
	public Id ServiceTerritoryId;
	public ServiceTerritory ServiceTerritory;
	public com.nawforce.runforce.System.String State;
	public com.nawforce.runforce.System.String StateCode;
	public com.nawforce.runforce.System.String Status;
	public com.nawforce.runforce.System.String StatusCategory;
	public com.nawforce.runforce.System.String Street;
	public com.nawforce.runforce.System.String Subject;
	public Id WorkTypeId;
	public WorkType WorkType;

	public ServiceAppointmentChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointmentChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointmentChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointmentChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointmentChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
