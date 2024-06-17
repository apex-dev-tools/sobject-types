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
public class HealthcareFacilityNetworkChangeEvent extends SObject {
	public static SObjectType$<HealthcareFacilityNetworkChangeEvent> SObjectType;
	public static SObjectFields$<HealthcareFacilityNetworkChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Date EffectiveFrom;
	public Date EffectiveTo;
	public String GenderRestriction;
	public Id HealthcareFacilityId;
	public HealthcareFacility HealthcareFacility;
	public Id HealthcareProviderId;
	public HealthcareProvider HealthcareProvider;
	public Integer HighestValidAge;
	public Id Id;
	public Boolean IsActive;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer LowestValidAge;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Decimal PanelLimit;
	public String PanelStatus;
	public Id PayerNetworkId;
	public HealthcarePayerNetwork PayerNetwork;
	public Id PractitionerFacilityId;
	public HealthcarePractitionerFacility PractitionerFacility;
	public Id PractitionerId;
	public Contact Practitioner;
	public Id ProviderNetworkContractId;
	public ProviderNetworkContract ProviderNetworkContract;
	public Id ProviderNetworkTierId;
	public ProviderNetworkTier ProviderNetworkTier;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;

	public HealthcareFacilityNetworkChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public HealthcareFacilityNetworkChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public HealthcareFacilityNetworkChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public HealthcareFacilityNetworkChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public HealthcareFacilityNetworkChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
