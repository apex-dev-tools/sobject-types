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
public class CarePgmProvHealthcareProviderChangeEvent extends SObject {
	public static SObjectType$<CarePgmProvHealthcareProviderChangeEvent> SObjectType;
	public static SObjectFields$<CarePgmProvHealthcareProviderChangeEvent> Fields;

	public Id CareProgramProviderId;
	public CareProgramProvider CareProgramProvider;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date EffectiveFrom;
	public Date EffectiveTo;
	public Id HealthcareProviderId;
	public HealthcareProvider HealthcareProvider;
	public Id Id;
	public Boolean IsPrimaryProvider;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;

	public CarePgmProvHealthcareProviderChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CarePgmProvHealthcareProviderChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CarePgmProvHealthcareProviderChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CarePgmProvHealthcareProviderChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CarePgmProvHealthcareProviderChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
