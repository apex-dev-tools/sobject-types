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
