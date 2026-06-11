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
public class OthrLifecyclEmssnFctrSetItemChangeEvent extends SObject {
	public static SObjectType$<OthrLifecyclEmssnFctrSetItemChangeEvent> SObjectType;
	public static SObjectFields$<OthrLifecyclEmssnFctrSetItemChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String ExternalIdentifier;
	public String FuelType;
	public Id FuelTypeRefId;
	public FuelType FuelTypeRef;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id ParentEmissionFactorId;
	public OthrLifecyclEmssnFctrSet ParentEmissionFactor;
	public Id ReferenceDataLoadLogId;
	public ReferenceDataLoadLog ReferenceDataLoadLog;
	public String ReplayId;
	public Boolean ShouldLockDtastUpdtForRec;
	public Decimal TrnsmDstrCh4EmssnFctr;
	public String TrnsmDstrCh4EmssnFctrUnit;
	public Decimal TrnsmDstrCo2EmssnFctr;
	public String TrnsmDstrCo2EmssnFctrUnit;
	public Decimal TrnsmDstrCo2eEmssnKl;
	public Decimal TrnsmDstrCo2eEmssnKm;
	public Decimal TrnsmDstrCo2eEmssnMwh;
	public Decimal TrnsmDstrN2oEmssnFctr;
	public String TrnsmDstrN2oEmssnFctrUnit;
	public Decimal TrnsmDstrSuplCo2eEmssn;
	public String TrnsmDstrSuplCo2eEmssnUnit;
	public Decimal Well2TkCh4EmssnFctr;
	public String Well2TkCh4EmssnFctrUnit;
	public Decimal Well2TkCo2EmssnFctr;
	public String Well2TkCo2EmssnFctrUnit;
	public Decimal Well2TkCo2eEmssnFctrKl;
	public Decimal Well2TkCo2eEmssnFctrKm;
	public Decimal Well2TkCo2eEmssnFctrMwh;
	public Decimal Well2TkN2oEmssnFctr;
	public String Well2TkN2oEmssnFctrUnit;
	public Decimal Well2TkSuplCo2eEmssn;
	public String Well2TkSuplCo2eEmssnUnit;
	public Decimal Well2TkTrnsmCh4Emssn;
	public String Well2TkTrnsmCh4EmssnUnit;
	public Decimal Well2TkTrnsmCo2Emssn;
	public String Well2TkTrnsmCo2EmssnUnit;
	public Decimal Well2TkTrnsmCo2eEmssnKl;
	public Decimal Well2TkTrnsmCo2eEmssnKm;
	public Decimal Well2TkTrnsmCo2eEmssnMwh;
	public Decimal Well2TkTrnsmN2oEmssn;
	public String Well2TkTrnsmN2oEmssnUnit;
	public Decimal Well2TkTrnsmSuplCo2e;
	public String Well2TkTrnsmSuplCo2eUnit;

	public OthrLifecyclEmssnFctrSetItemChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public OthrLifecyclEmssnFctrSetItemChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OthrLifecyclEmssnFctrSetItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OthrLifecyclEmssnFctrSetItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OthrLifecyclEmssnFctrSetItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
