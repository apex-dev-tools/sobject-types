/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class PackageLicense extends SObject {
	public static SObjectType$<PackageLicense> SObjectType;
	public static SObjectFields$<PackageLicense> Fields;

	public Integer AllowedLicenses;
	public Datetime CreatedDate;
	public Datetime ExpirationDate;
	public Id Id;
	public Boolean IsAvailableForIntegrations;
	public Boolean IsProvisioned;
	public Datetime LastModifiedDate;
	public String NamespacePrefix;
	public String Status;
	public Datetime SystemModstamp;
	public Integer UsedLicenses;

	public PackageLicense clone$() {throw new java.lang.UnsupportedOperationException();}
	public PackageLicense clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PackageLicense clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PackageLicense clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PackageLicense clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
