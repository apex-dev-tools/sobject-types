/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
