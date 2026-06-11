/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class InsuranceContractChangeEvent extends SObject {
	public static SObjectType$<InsuranceContractChangeEvent> SObjectType;
	public static SObjectFields$<InsuranceContractChangeEvent> Fields;

	public Id BrokerageAgencyId;
	public Producer BrokerageAgency;
	public Id BusinessLicenseId;
	public BusinessLicense BusinessLicense;
	public Object ChangeEventHeader;
	public Id ContractId;
	public Contract Contract;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Id EnrollmentCensusId;
	public GroupCensus EnrollmentCensus;
	public Date EnrollmentEndDate;
	public Date EnrollmentStartDate;
	public Integer EnrollmentWaitingPeriod;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id ProducerId;
	public Producer Producer;
	public String ReplayId;
	public Id UnderwriterId;
	public User Underwriter;

	public InsuranceContractChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public InsuranceContractChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceContractChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceContractChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceContractChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
