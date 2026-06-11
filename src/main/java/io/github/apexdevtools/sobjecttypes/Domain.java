/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class Domain extends SObject {
	public static SObjectType$<Domain> SObjectType;
	public static SObjectFields$<Domain> Fields;

	public String CnameTarget;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Domain;
	public String DomainType;
	public String HttpsOption;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Boolean OptionsHstsPreload;
	public Datetime SystemModstamp;

	public DomainSite[] DomainSites;

	public Domain clone$() {throw new java.lang.UnsupportedOperationException();}
	public Domain clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Domain clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Domain clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Domain clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
