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
public class OmniProcessCompilation extends SObject {
	public static SObjectType$<OmniProcessCompilation> SObjectType;
	public static SObjectFields$<OmniProcessCompilation> Fields;

	public String Content;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OmniProcessId;
	public OmniProcess OmniProcess;
	public Decimal Sequence;
	public Datetime SystemModstamp;

	public OmniProcessCompilation clone$() {throw new java.lang.UnsupportedOperationException();}
	public OmniProcessCompilation clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OmniProcessCompilation clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OmniProcessCompilation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OmniProcessCompilation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
