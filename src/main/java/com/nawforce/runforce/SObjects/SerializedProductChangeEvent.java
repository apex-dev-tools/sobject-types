/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class SerializedProductChangeEvent extends SObject {
	public static SObjectType$<SerializedProductChangeEvent> SObjectType;
	public static SObjectFields$<SerializedProductChangeEvent> Fields;

	public Id AssetId;
	public Asset Asset;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date ExpirationDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id Product2Id;
	public Product2 Product2;
	public Id ProductItemId;
	public ProductItem ProductItem;
	public String ReplayId;
	public String SerialNumber;
	public String Status;

	public SerializedProductChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public SerializedProductChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SerializedProductChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SerializedProductChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SerializedProductChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
