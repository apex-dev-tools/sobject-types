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
public class HealthcarePayerNetworkChangeEvent extends SObject {
	public static SObjectType$<HealthcarePayerNetworkChangeEvent> SObjectType;
	public static SObjectFields$<HealthcarePayerNetworkChangeEvent> Fields;

	public Object ChangeEventHeader;
	public String Code;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Date EffectiveFrom;
	public Date EffectiveTo;
	public Id Id;
	public Boolean IsActive;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LineofBusiness;
	public String Name;
	public String NetworkType;
	public Id OwnerId;
	public User Owner;
	public Id ParentPayerNetworkId;
	public HealthcarePayerNetwork ParentPayerNetwork;
	public Id PayerId;
	public Account Payer;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;

	public HealthcarePayerNetworkChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public HealthcarePayerNetworkChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public HealthcarePayerNetworkChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public HealthcarePayerNetworkChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public HealthcarePayerNetworkChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
