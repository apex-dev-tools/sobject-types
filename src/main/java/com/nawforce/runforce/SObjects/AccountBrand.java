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
public class AccountBrand extends SObject {
	public static SObjectType$<AccountBrand> SObjectType;
	public static SObjectFields$<AccountBrand> Fields;

	public Id AccountId;
	public Account Account;
	public Address Address;
	public String City;
	public String CompanyName;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Email;
	public String GeocodeAccuracy;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal Latitude;
	public Id LogoId;
	public ContentAsset Logo;
	public String LogoUrl;
	public Decimal Longitude;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String Phone;
	public String PostalCode;
	public String State;
	public String StateCode;
	public String Street;
	public Datetime SystemModstamp;
	public String Website;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public AccountBrandShare[] Shares;

	public AccountBrand clone$() {throw new java.lang.UnsupportedOperationException();}
	public AccountBrand clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AccountBrand clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AccountBrand clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AccountBrand clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
