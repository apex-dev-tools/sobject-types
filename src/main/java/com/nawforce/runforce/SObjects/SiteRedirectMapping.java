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
