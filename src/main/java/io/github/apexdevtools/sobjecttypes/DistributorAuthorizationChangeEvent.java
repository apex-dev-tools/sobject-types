/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class DistributorAuthorizationChangeEvent extends SObject {
	public static SObjectType$<DistributorAuthorizationChangeEvent> SObjectType;
	public static SObjectFields$<DistributorAuthorizationChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Id AuthorizedInsuranceLineId;
	public AuthorizedInsuranceLine AuthorizedInsuranceLine;
	public Object ChangeEventHeader;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date EffectiveDate;
	public Date ExpirationDate;
	public Id Id;
	public Boolean IsActive;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LicenseId;
	public BusinessLicense License;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public String Status;
	public String TerminationCause;

	public DistributorAuthorizationChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DistributorAuthorizationChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DistributorAuthorizationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DistributorAuthorizationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DistributorAuthorizationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
