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
public class AssociatedLocationChangeEvent extends SObject {
	public static SObjectType$<AssociatedLocationChangeEvent> SObjectType;
	public static SObjectFields$<AssociatedLocationChangeEvent> Fields;

	public Datetime ActiveFrom;
	public Datetime ActiveTo;
	public String AssociatedLocationNumber;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LocationId;
	public Location Location;
	public Id ParentRecordId;
	public Account ParentRecord;
	public String ReplayId;
	public String Type;

	public AssociatedLocationChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AssociatedLocationChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AssociatedLocationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AssociatedLocationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AssociatedLocationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
