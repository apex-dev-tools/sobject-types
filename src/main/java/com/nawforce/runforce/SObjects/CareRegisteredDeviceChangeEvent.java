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
public class CareRegisteredDeviceChangeEvent extends SObject {
	public static SObjectType$<CareRegisteredDeviceChangeEvent> SObjectType;
	public static SObjectFields$<CareRegisteredDeviceChangeEvent> Fields;

	public Id CareProgramEnrolleeId;
	public CareProgramEnrollee CareProgramEnrollee;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DeviceId;
	public Asset Device;
	public Id DeviceTypeId;
	public CodeSet DeviceType;
	public String Division;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String NameType;
	public Id PatientId;
	public Account Patient;
	public Datetime RegistrationDate;
	public String ReplayId;
	public String SafetyInformation;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public String Status;
	public String SupportContactDetail;
	public String UniqueDeviceId1;
	public String UniqueDeviceId1Issuer;
	public String UniqueDeviceId2;
	public String UniqueDeviceId2Issuer;
	public String UniqueDeviceId3;
	public String UniqueDeviceId3Issuer;

	public CareRegisteredDeviceChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareRegisteredDeviceChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareRegisteredDeviceChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareRegisteredDeviceChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareRegisteredDeviceChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
