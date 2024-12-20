/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
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
	public String AdditionalInformation;
	public Address Address;
	public Id AppointmentCategoryId;
	public AppointmentCategory AppointmentCategory;
	public Id AppointmentInvitationId;
	public AppointmentInvitation AppointmentInvitation;
	public String AppointmentMode;
	public String AppointmentNumber;
	public String AppointmentType;
	public String ApptBookingInfoUrl;
	public Datetime ArrivalWindowEndTime;
	public Datetime ArrivalWindowStartTime;
	public Integer AttendeeCount;
	public Integer AttendeeLimit;
	public Id BundlePolicyId;
	public ApptBundlePolicy BundlePolicy;
	public String CancellationReason;
	public Object ChangeEventHeader;
	public Datetime CheckedInTime;
	public String City;
	public String Comments;
	public Id ContactId;
	public Contact Contact;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Datetime DueDate;
	public Decimal Duration;
	public Decimal DurationInMinutes;
	public String DurationType;
	public Datetime EarliestStartTime;
	public String Email;
	public Id EngagementChannelTypeId;
	public EngagementChannelType EngagementChannelType;
	public String GeocodeAccuracy;
	public String GroupAppointmentAccessType;
	public Id Id;
	public Boolean IsAnonymousBooking;
	public Boolean IsBundle;
	public Boolean IsBundleMember;
	public Boolean IsManuallyBundled;
	public Boolean IsOffsiteAppointment;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal Latitude;
	public Decimal Longitude;
	public Id OwnerId;
	public User Owner;
	public Id ParentRecordId;
	public SObject ParentRecord;
	public String Phone;
	public String PostalCode;
	public Id RelatedBundleId;
	public ServiceAppointment RelatedBundle;
	public String ReplayId;
	public Datetime SchedEndTime;
	public Datetime SchedStartTime;
	public String ServiceNote;
	public Id ServiceTerritoryId;
	public ServiceTerritory ServiceTerritory;
	public String State;
	public String StateCode;
	public String Status;
	public String StatusCategory;
	public String Street;
	public String Subject;
	public String Transaction;
	public Id WorkTypeId;
	public WorkType WorkType;

	public ServiceAppointmentChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointmentChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointmentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointmentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointmentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
