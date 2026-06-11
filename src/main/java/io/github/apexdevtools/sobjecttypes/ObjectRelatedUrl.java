/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ObjectRelatedUrl extends SObject {
	public static SObjectType$<ObjectRelatedUrl> SObjectType;
	public static SObjectFields$<ObjectRelatedUrl> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public String LanguageCode;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id ParentId;
	public Name Parent;
	public String Scope;
	public Datetime SystemModstamp;
	public String UniqueIndex;
	public String UrlName;

	public ObjectRelatedUrl clone$() {throw new java.lang.UnsupportedOperationException();}
	public ObjectRelatedUrl clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ObjectRelatedUrl clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ObjectRelatedUrl clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ObjectRelatedUrl clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
