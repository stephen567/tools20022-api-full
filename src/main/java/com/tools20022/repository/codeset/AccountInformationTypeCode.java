/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of account information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#SecuritiesCustodianAccountNumber
 * AccountInformationTypeCode.SecuritiesCustodianAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#SecuritiesCustodianAccountName
 * AccountInformationTypeCode.SecuritiesCustodianAccountName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#MarginSettlementAccountNumber
 * AccountInformationTypeCode.MarginSettlementAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#MarginCustodianAccountNumber
 * AccountInformationTypeCode.MarginCustodianAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#MarginSettlementBankName
 * AccountInformationTypeCode.MarginSettlementBankName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#IntermediaryBankNameOfContraCurrency
 * AccountInformationTypeCode.IntermediaryBankNameOfContraCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#BeneficiaryInstitutionNameOfDealtCurrency
 * AccountInformationTypeCode.BeneficiaryInstitutionNameOfDealtCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#CorrespondentBankBICCodeOfContraCurrency
 * AccountInformationTypeCode.CorrespondentBankBICCodeOfContraCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#BeneficiaryInstitutionBICCodeOfDealtCurrency
 * AccountInformationTypeCode.BeneficiaryInstitutionBICCodeOfDealtCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#CorrespondentBankNameOfContraCurrency
 * AccountInformationTypeCode.CorrespondentBankNameOfContraCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#BeneficiaryInstitutionNumberOfDealtCurrency
 * AccountInformationTypeCode.BeneficiaryInstitutionNumberOfDealtCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#CorrespondentBankNumberOfContraCurrency
 * AccountInformationTypeCode.CorrespondentBankNumberOfContraCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#CorrespondentBankNameOfDealtCurrency
 * AccountInformationTypeCode.CorrespondentBankNameOfDealtCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#BeneficiaryInstitutionBICCodeOfContraCurrency
 * AccountInformationTypeCode.BeneficiaryInstitutionBICCodeOfContraCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#CorrespondentBankBICCodeOfDealtCurrency
 * AccountInformationTypeCode.CorrespondentBankBICCodeOfDealtCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#BeneficiaryInstitutionNameOfContraCurrency
 * AccountInformationTypeCode.BeneficiaryInstitutionNameOfContraCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#CorrespondentBankNumberOfDealtCurrency
 * AccountInformationTypeCode.CorrespondentBankNumberOfDealtCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#BeneficiaryInstitutionNumberOfContraCurrency
 * AccountInformationTypeCode.BeneficiaryInstitutionNumberOfContraCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#IntermediaryBankNameOfDealtCurrency
 * AccountInformationTypeCode.IntermediaryBankNameOfDealtCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#NoteOfContraCurrency
 * AccountInformationTypeCode.NoteOfContraCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#IntermediaryBankBICCodeOfDealtCurrency
 * AccountInformationTypeCode.IntermediaryBankBICCodeOfDealtCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#IntermediaryBankNumberOfContraCurrency
 * AccountInformationTypeCode.IntermediaryBankNumberOfContraCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#IntermediaryBankNumberOfDealtCurrency
 * AccountInformationTypeCode.IntermediaryBankNumberOfDealtCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#SecuritiesCustodianAccountChineseName
 * AccountInformationTypeCode.SecuritiesCustodianAccountChineseName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#CurrentAccount
 * AccountInformationTypeCode.CurrentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#DepositAccount
 * AccountInformationTypeCode.DepositAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#MultiCurrencyAccountDescription
 * AccountInformationTypeCode.MultiCurrencyAccountDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#OtherMarginSettlementAccountNumber
 * AccountInformationTypeCode.OtherMarginSettlementAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#CFETSMarginSettlementAccountNumber
 * AccountInformationTypeCode.CFETSMarginSettlementAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#SecuritiesCustodianInstitutionCode
 * AccountInformationTypeCode.SecuritiesCustodianInstitutionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#MarginCustodianInstitutionCode
 * AccountInformationTypeCode.MarginCustodianInstitutionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#MarginSettlementBankSortCode
 * AccountInformationTypeCode.MarginSettlementBankSortCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#StatusOfCashAccount
 * AccountInformationTypeCode.StatusOfCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#StatusOfSecuritiesCustodianAccount
 * AccountInformationTypeCode.StatusOfSecuritiesCustodianAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#MarginCustodianAccountName
 * AccountInformationTypeCode.MarginCustodianAccountName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#MarginSettlementAccountName
 * AccountInformationTypeCode.MarginSettlementAccountName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#FundCustodianAccountName
 * AccountInformationTypeCode.FundCustodianAccountName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#FundCustodianAccountNumber
 * AccountInformationTypeCode.FundCustodianAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#FundCustodianBankName
 * AccountInformationTypeCode.FundCustodianBankName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#SecuritiesCustodianInstitutionName
 * AccountInformationTypeCode.SecuritiesCustodianInstitutionName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#MarginCustodianInstitutionName
 * AccountInformationTypeCode.MarginCustodianInstitutionName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#NoteOfDealtCurrency
 * AccountInformationTypeCode.NoteOfDealtCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode#IntermediaryBankBICCodeOfContraCurrency
 * AccountInformationTypeCode.IntermediaryBankBICCodeOfContraCurrency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
 * AccountInformationType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountInformationTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of account information."</li>
 * </ul>
 */
public class AccountInformationTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account number of securities custodians.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCustodianAccountNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account number of securities custodians."</li>
	 * </ul>
	 */
	public static final MMCode SecuritiesCustodianAccountNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCustodianAccountNumber";
			definition = "Account number of securities custodians.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "SCAN";
		}
	};
	/**
	 * Account name of securities custodians.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCAA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCustodianAccountName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account name of securities custodians."</li>
	 * </ul>
	 */
	public static final MMCode SecuritiesCustodianAccountName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCustodianAccountName";
			definition = "Account name of securities custodians.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "SCAA";
		}
	};
	/**
	 * Margin settlement account number of CDC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MSAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginSettlementAccountNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Margin settlement account number of CDC."</li>
	 * </ul>
	 */
	public static final MMCode MarginSettlementAccountNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginSettlementAccountNumber";
			definition = "Margin settlement account number of CDC.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "MSAN";
		}
	};
	/**
	 * Custodian account number of margin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCustodianAccountNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Custodian account number of margin."</li>
	 * </ul>
	 */
	public static final MMCode MarginCustodianAccountNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCustodianAccountNumber";
			definition = "Custodian account number of margin.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "MCAN";
		}
	};
	/**
	 * Settlement bank name of margin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MSBN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginSettlementBankName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement bank name of margin."</li>
	 * </ul>
	 */
	public static final MMCode MarginSettlementBankName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginSettlementBankName";
			definition = "Settlement bank name of margin.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "MSBN";
		}
	};
	/**
	 * Name of intermediary bank for contra currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IBNC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryBankNameOfContraCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of intermediary bank for contra currency."</li>
	 * </ul>
	 */
	public static final MMCode IntermediaryBankNameOfContraCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryBankNameOfContraCurrency";
			definition = "Name of intermediary bank for contra currency.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "IBNC";
		}
	};
	/**
	 * Name of beneficiary institution for dealt currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BIND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryInstitutionNameOfDealtCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of beneficiary institution for dealt currency."</li>
	 * </ul>
	 */
	public static final MMCode BeneficiaryInstitutionNameOfDealtCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryInstitutionNameOfDealtCurrency";
			definition = "Name of beneficiary institution for dealt currency.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "BIND";
		}
	};
	/**
	 * BIC code of correspondent bank for contra currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBBC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrespondentBankBICCodeOfContraCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "BIC code of correspondent bank for contra currency."</li>
	 * </ul>
	 */
	public static final MMCode CorrespondentBankBICCodeOfContraCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondentBankBICCodeOfContraCurrency";
			definition = "BIC code of correspondent bank for contra currency.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "CBBC";
		}
	};
	/**
	 * BIC code of beneficiary institution for dealt currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BIBD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryInstitutionBICCodeOfDealtCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "BIC code of beneficiary institution for dealt currency."</li>
	 * </ul>
	 */
	public static final MMCode BeneficiaryInstitutionBICCodeOfDealtCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryInstitutionBICCodeOfDealtCurrency";
			definition = "BIC code of beneficiary institution for dealt currency.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "BIBD";
		}
	};
	/**
	 * Name of correspondent bank for contra currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBNC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrespondentBankNameOfContraCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of correspondent bank for contra currency."</li>
	 * </ul>
	 */
	public static final MMCode CorrespondentBankNameOfContraCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondentBankNameOfContraCurrency";
			definition = "Name of correspondent bank for contra currency.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "CBNC";
		}
	};
	/**
	 * Number of beneficiary institution for dealt currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BIDC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryInstitutionNumberOfDealtCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of beneficiary institution for dealt currency."</li>
	 * </ul>
	 */
	public static final MMCode BeneficiaryInstitutionNumberOfDealtCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryInstitutionNumberOfDealtCurrency";
			definition = "Number of beneficiary institution for dealt currency.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "BIDC";
		}
	};
	/**
	 * Number of correspondent bank for contra currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrespondentBankNumberOfContraCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of correspondent bank for contra currency."</li>
	 * </ul>
	 */
	public static final MMCode CorrespondentBankNumberOfContraCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondentBankNumberOfContraCurrency";
			definition = "Number of correspondent bank for contra currency.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "CBCC";
		}
	};
	/**
	 * Name of correspondent bank for dealt currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrespondentBankNameOfDealtCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of correspondent bank for dealt currency."</li>
	 * </ul>
	 */
	public static final MMCode CorrespondentBankNameOfDealtCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondentBankNameOfDealtCurrency";
			definition = "Name of correspondent bank for dealt currency.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "CBND";
		}
	};
	/**
	 * BIC code of beneficiary institution for contra currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BIBC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryInstitutionBICCodeOfContraCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "BIC code of beneficiary institution for contra currency."</li>
	 * </ul>
	 */
	public static final MMCode BeneficiaryInstitutionBICCodeOfContraCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryInstitutionBICCodeOfContraCurrency";
			definition = "BIC code of beneficiary institution for contra currency.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "BIBC";
		}
	};
	/**
	 * BIC code of correspondent bank for dealt currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBBD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrespondentBankBICCodeOfDealtCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "BIC code of correspondent bank for dealt currency."</li>
	 * </ul>
	 */
	public static final MMCode CorrespondentBankBICCodeOfDealtCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondentBankBICCodeOfDealtCurrency";
			definition = "BIC code of correspondent bank for dealt currency.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "CBBD";
		}
	};
	/**
	 * Name of beneficiary institution for contra currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BINC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryInstitutionNameOfContraCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of beneficiary institution for contra currency."</li>
	 * </ul>
	 */
	public static final MMCode BeneficiaryInstitutionNameOfContraCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryInstitutionNameOfContraCurrency";
			definition = "Name of beneficiary institution for contra currency.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "BINC";
		}
	};
	/**
	 * Number of correspondent bank for dealt currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBDC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrespondentBankNumberOfDealtCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of correspondent bank for dealt currency."</li>
	 * </ul>
	 */
	public static final MMCode CorrespondentBankNumberOfDealtCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondentBankNumberOfDealtCurrency";
			definition = "Number of correspondent bank for dealt currency.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "CBDC";
		}
	};
	/**
	 * Number of beneficiary institution for contra currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BICC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryInstitutionNumberOfContraCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of beneficiary institution for contra currency."</li>
	 * </ul>
	 */
	public static final MMCode BeneficiaryInstitutionNumberOfContraCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryInstitutionNumberOfContraCurrency";
			definition = "Number of beneficiary institution for contra currency.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "BICC";
		}
	};
	/**
	 * Name of intermediary bank for dealt currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IBND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryBankNameOfDealtCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of intermediary bank for dealt currency."</li>
	 * </ul>
	 */
	public static final MMCode IntermediaryBankNameOfDealtCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryBankNameOfDealtCurrency";
			definition = "Name of intermediary bank for dealt currency.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "IBND";
		}
	};
	/**
	 * Note for contra currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoteOfContraCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Note for contra currency."</li>
	 * </ul>
	 */
	public static final MMCode NoteOfContraCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoteOfContraCurrency";
			definition = "Note for contra currency.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "NOCC";
		}
	};
	/**
	 * BIC code of intermediary bank for dealt currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IBBD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryBankBICCodeOfDealtCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "BIC code of intermediary bank for dealt currency."</li>
	 * </ul>
	 */
	public static final MMCode IntermediaryBankBICCodeOfDealtCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryBankBICCodeOfDealtCurrency";
			definition = "BIC code of intermediary bank for dealt currency.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "IBBD";
		}
	};
	/**
	 * Number of intermediary bank for contra currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IBCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryBankNumberOfContraCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of intermediary bank for contra currency."</li>
	 * </ul>
	 */
	public static final MMCode IntermediaryBankNumberOfContraCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryBankNumberOfContraCurrency";
			definition = "Number of intermediary bank for contra currency.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "IBCC";
		}
	};
	/**
	 * Number of intermediary bank for dealt currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IBDC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryBankNumberOfDealtCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of intermediary bank for dealt currency."</li>
	 * </ul>
	 */
	public static final MMCode IntermediaryBankNumberOfDealtCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryBankNumberOfDealtCurrency";
			definition = "Number of intermediary bank for dealt currency.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "IBDC";
		}
	};
	/**
	 * Account chinese name of securities custodians.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCustodianAccountChineseName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account chinese name of securities custodians."</li>
	 * </ul>
	 */
	public static final MMCode SecuritiesCustodianAccountChineseName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCustodianAccountChineseName";
			definition = "Account chinese name of securities custodians.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "SCAC";
		}
	};
	/**
	 * Specifies the current account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the current account."</li>
	 * </ul>
	 */
	public static final MMCode CurrentAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentAccount";
			definition = "Specifies the current account.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "CUAC";
		}
	};
	/**
	 * Specifies the deposit account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the deposit account."</li>
	 * </ul>
	 */
	public static final MMCode DepositAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositAccount";
			definition = "Specifies the deposit account.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "DEAC";
		}
	};
	/**
	 * Description of multi currency account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultiCurrencyAccountDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of multi currency account."</li>
	 * </ul>
	 */
	public static final MMCode MultiCurrencyAccountDescription = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultiCurrencyAccountDescription";
			definition = "Description of multi currency account.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "MCAD";
		}
	};
	/**
	 * Margin settlement account number of other institutions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OMSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherMarginSettlementAccountNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Margin settlement account number of other institutions."</li>
	 * </ul>
	 */
	public static final MMCode OtherMarginSettlementAccountNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherMarginSettlementAccountNumber";
			definition = "Margin settlement account number of other institutions.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "OMSA";
		}
	};
	/**
	 * Margin settlement account number of CFETS.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CFETSMarginSettlementAccountNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Margin settlement account number of CFETS."</li>
	 * </ul>
	 */
	public static final MMCode CFETSMarginSettlementAccountNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CFETSMarginSettlementAccountNumber";
			definition = "Margin settlement account number of CFETS.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "CMSA";
		}
	};
	/**
	 * Code of securities custodian institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCustodianInstitutionCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code of securities custodian institution."</li>
	 * </ul>
	 */
	public static final MMCode SecuritiesCustodianInstitutionCode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCustodianInstitutionCode";
			definition = "Code of securities custodian institution.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "SCIC";
		}
	};
	/**
	 * Code of margin custodian institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCustodianInstitutionCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code of margin custodian institution."</li>
	 * </ul>
	 */
	public static final MMCode MarginCustodianInstitutionCode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCustodianInstitutionCode";
			definition = "Code of margin custodian institution.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "MCIC";
		}
	};
	/**
	 * Settlement bank sort code of margin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MSBS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginSettlementBankSortCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement bank sort code of margin."</li>
	 * </ul>
	 */
	public static final MMCode MarginSettlementBankSortCode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginSettlementBankSortCode";
			definition = "Settlement bank sort code of margin.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "MSBS";
		}
	};
	/**
	 * Status of cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusOfCashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of cash account."</li>
	 * </ul>
	 */
	public static final MMCode StatusOfCashAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusOfCashAccount";
			definition = "Status of cash account.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "SOCA";
		}
	};
	/**
	 * Status of securities custodian account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusOfSecuritiesCustodianAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of securities custodian account."</li>
	 * </ul>
	 */
	public static final MMCode StatusOfSecuritiesCustodianAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusOfSecuritiesCustodianAccount";
			definition = "Status of securities custodian account.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "SSCA";
		}
	};
	/**
	 * Custodian account name of margin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCAA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCustodianAccountName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Custodian account name of margin."</li>
	 * </ul>
	 */
	public static final MMCode MarginCustodianAccountName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCustodianAccountName";
			definition = "Custodian account name of margin.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "MCAA";
		}
	};
	/**
	 * Settlement account name of margin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MSAA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginSettlementAccountName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement account name of margin."</li>
	 * </ul>
	 */
	public static final MMCode MarginSettlementAccountName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginSettlementAccountName";
			definition = "Settlement account name of margin.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "MSAA";
		}
	};
	/**
	 * Account name of fund custodian.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCAA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundCustodianAccountName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account name of fund custodian."</li>
	 * </ul>
	 */
	public static final MMCode FundCustodianAccountName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundCustodianAccountName";
			definition = "Account name of fund custodian.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "FCAA";
		}
	};
	/**
	 * Account number of fund custodian.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundCustodianAccountNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account number of fund custodian."</li>
	 * </ul>
	 */
	public static final MMCode FundCustodianAccountNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundCustodianAccountNumber";
			definition = "Account number of fund custodian.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "FCAN";
		}
	};
	/**
	 * Name of fund custodian bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCBN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundCustodianBankName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of fund custodian bank."</li>
	 * </ul>
	 */
	public static final MMCode FundCustodianBankName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundCustodianBankName";
			definition = "Name of fund custodian bank.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "FCBN";
		}
	};
	/**
	 * Name of securities custodian institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCustodianInstitutionName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of securities custodian institution."</li>
	 * </ul>
	 */
	public static final MMCode SecuritiesCustodianInstitutionName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCustodianInstitutionName";
			definition = "Name of securities custodian institution.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "SCIN";
		}
	};
	/**
	 * Name of margin custodian institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCustodianInstitutionName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of margin custodian institution."</li>
	 * </ul>
	 */
	public static final MMCode MarginCustodianInstitutionName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCustodianInstitutionName";
			definition = "Name of margin custodian institution.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "MCIN";
		}
	};
	/**
	 * Note for dealt currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NODC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoteOfDealtCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Note for dealt currency."</li>
	 * </ul>
	 */
	public static final MMCode NoteOfDealtCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoteOfDealtCurrency";
			definition = "Note for dealt currency.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "NODC";
		}
	};
	/**
	 * BIC code of intermediary bank for contra currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
	 * AccountInformationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IBBC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryBankBICCodeOfContraCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "BIC code of intermediary bank for contra currency."</li>
	 * </ul>
	 */
	public static final MMCode IntermediaryBankBICCodeOfContraCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryBankBICCodeOfContraCurrency";
			definition = "BIC code of intermediary bank for contra currency.";
			owner_lazy = () -> AccountInformationTypeCode.mmObject();
			codeName = "IBBC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountInformationTypeCode";
				definition = "Specifies the type of account information.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountInformationTypeCode.SecuritiesCustodianAccountNumber, com.tools20022.repository.codeset.AccountInformationTypeCode.SecuritiesCustodianAccountName,
						com.tools20022.repository.codeset.AccountInformationTypeCode.MarginSettlementAccountNumber, com.tools20022.repository.codeset.AccountInformationTypeCode.MarginCustodianAccountNumber,
						com.tools20022.repository.codeset.AccountInformationTypeCode.MarginSettlementBankName, com.tools20022.repository.codeset.AccountInformationTypeCode.IntermediaryBankNameOfContraCurrency,
						com.tools20022.repository.codeset.AccountInformationTypeCode.BeneficiaryInstitutionNameOfDealtCurrency, com.tools20022.repository.codeset.AccountInformationTypeCode.CorrespondentBankBICCodeOfContraCurrency,
						com.tools20022.repository.codeset.AccountInformationTypeCode.BeneficiaryInstitutionBICCodeOfDealtCurrency, com.tools20022.repository.codeset.AccountInformationTypeCode.CorrespondentBankNameOfContraCurrency,
						com.tools20022.repository.codeset.AccountInformationTypeCode.BeneficiaryInstitutionNumberOfDealtCurrency, com.tools20022.repository.codeset.AccountInformationTypeCode.CorrespondentBankNumberOfContraCurrency,
						com.tools20022.repository.codeset.AccountInformationTypeCode.CorrespondentBankNameOfDealtCurrency, com.tools20022.repository.codeset.AccountInformationTypeCode.BeneficiaryInstitutionBICCodeOfContraCurrency,
						com.tools20022.repository.codeset.AccountInformationTypeCode.CorrespondentBankBICCodeOfDealtCurrency, com.tools20022.repository.codeset.AccountInformationTypeCode.BeneficiaryInstitutionNameOfContraCurrency,
						com.tools20022.repository.codeset.AccountInformationTypeCode.CorrespondentBankNumberOfDealtCurrency, com.tools20022.repository.codeset.AccountInformationTypeCode.BeneficiaryInstitutionNumberOfContraCurrency,
						com.tools20022.repository.codeset.AccountInformationTypeCode.IntermediaryBankNameOfDealtCurrency, com.tools20022.repository.codeset.AccountInformationTypeCode.NoteOfContraCurrency,
						com.tools20022.repository.codeset.AccountInformationTypeCode.IntermediaryBankBICCodeOfDealtCurrency, com.tools20022.repository.codeset.AccountInformationTypeCode.IntermediaryBankNumberOfContraCurrency,
						com.tools20022.repository.codeset.AccountInformationTypeCode.IntermediaryBankNumberOfDealtCurrency, com.tools20022.repository.codeset.AccountInformationTypeCode.SecuritiesCustodianAccountChineseName,
						com.tools20022.repository.codeset.AccountInformationTypeCode.CurrentAccount, com.tools20022.repository.codeset.AccountInformationTypeCode.DepositAccount,
						com.tools20022.repository.codeset.AccountInformationTypeCode.MultiCurrencyAccountDescription, com.tools20022.repository.codeset.AccountInformationTypeCode.OtherMarginSettlementAccountNumber,
						com.tools20022.repository.codeset.AccountInformationTypeCode.CFETSMarginSettlementAccountNumber, com.tools20022.repository.codeset.AccountInformationTypeCode.SecuritiesCustodianInstitutionCode,
						com.tools20022.repository.codeset.AccountInformationTypeCode.MarginCustodianInstitutionCode, com.tools20022.repository.codeset.AccountInformationTypeCode.MarginSettlementBankSortCode,
						com.tools20022.repository.codeset.AccountInformationTypeCode.StatusOfCashAccount, com.tools20022.repository.codeset.AccountInformationTypeCode.StatusOfSecuritiesCustodianAccount,
						com.tools20022.repository.codeset.AccountInformationTypeCode.MarginCustodianAccountName, com.tools20022.repository.codeset.AccountInformationTypeCode.MarginSettlementAccountName,
						com.tools20022.repository.codeset.AccountInformationTypeCode.FundCustodianAccountName, com.tools20022.repository.codeset.AccountInformationTypeCode.FundCustodianAccountNumber,
						com.tools20022.repository.codeset.AccountInformationTypeCode.FundCustodianBankName, com.tools20022.repository.codeset.AccountInformationTypeCode.SecuritiesCustodianInstitutionName,
						com.tools20022.repository.codeset.AccountInformationTypeCode.MarginCustodianInstitutionName, com.tools20022.repository.codeset.AccountInformationTypeCode.NoteOfDealtCurrency,
						com.tools20022.repository.codeset.AccountInformationTypeCode.IntermediaryBankBICCodeOfContraCurrency);
				derivation_lazy = () -> Arrays.asList(AccountInformationType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}