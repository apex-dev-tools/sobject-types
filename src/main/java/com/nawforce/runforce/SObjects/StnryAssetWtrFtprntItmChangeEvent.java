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
public class StnryAssetWtrFtprntItmChangeEvent extends SObject {
	public static SObjectType$<StnryAssetWtrFtprntItmChangeEvent> SObjectType;
	public static SObjectFields$<StnryAssetWtrFtprntItmChangeEvent> Fields;

	public String ActivitySourceType;
	public String ActivityType;
	public String BaselineWaterStress;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsRecordLocked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id ParentWaterFootprintId;
	public StnryAssetWaterFtprnt ParentWaterFootprint;
	public Id PrevYearWtrFtprntItemId;
	public StnryAssetWtrFtprntItm PrevYearWtrFtprntItem;
	public Decimal QuantityInMl;
	public String ReplayId;
	public Decimal TotalCost;
	public String TreatmentType;
	public Decimal WaterActivityPct;

	public StnryAssetWtrFtprntItmChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetWtrFtprntItmChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetWtrFtprntItmChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetWtrFtprntItmChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetWtrFtprntItmChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
