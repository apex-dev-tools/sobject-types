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
public class SiteRedirectMapping extends SObject {
	public static SObjectType$<SiteRedirectMapping> SObjectType;
	public static SObjectFields$<SiteRedirectMapping> Fields;

	public String Action;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDynamic;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id SiteId;
	public Site Site;
	public String Source;
	public Datetime SystemModstamp;
	public String Target;

	public SiteRedirectMapping clone$() {throw new java.lang.UnsupportedOperationException();}
	public SiteRedirectMapping clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SiteRedirectMapping clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SiteRedirectMapping clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SiteRedirectMapping clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
